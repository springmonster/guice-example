package com.khch.assisted;// Main

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import com.google.inject.grapher.graphviz.GraphvizGrapher;
import com.google.inject.grapher.graphviz.GraphvizModule;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {
        int argNum = new Random().nextInt(100);

        Injector demoInjector =
                Guice.createInjector(
                        Stage.DEVELOPMENT,
                        new AppModule());
        String filename = "test.dot";
        PrintWriter out = new PrintWriter(filename, "UTF-8");

        Injector injector = Guice.createInjector(new GraphvizModule());
        GraphvizGrapher grapher = injector.getInstance(GraphvizGrapher.class);
        grapher.setOut(out);
        grapher.setRankdir("TB");
        grapher.graph(demoInjector);

        ClassWithAssistedInjectionFactory f = demoInjector.getInstance(ClassWithAssistedInjectionFactory.class);
        ClassWithAssistedInjection ci = f.create(argNum);
        System.out.println(ci.mixedMessage());
    }
}
