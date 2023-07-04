# Github

- [Guice](https://github.com/eugenp/tutorials/tree/master/di-modules/guice)

# Description

- If TypeA is an interface, then, we must have bindings to concrete classes.
-

```shell
bind(TypeA.class).to(ConcreteTypeA.class);
```

`- If TypeA is a concrete class, then, we can bind it to itself.

1. No Bindings`
2. Bindings to itself

```shell
bind(TypeA.class).to(SubClassOfTypeA.class);
```

# Example

![img.png](Object Graph.png)
![img.png](img.png)
![img_1.png](img_1.png)
![img_2.png](img_2.png)

