# Github

- [Guice](https://github.com/eugenp/tutorials/tree/master/di-modules/guice)

# Description

- If TypeA is an interface, then, we must have bindings to concrete classes.

```java
bind(TypeA.class).to(ConcreteTypeA.class);
```

`- If TypeA is a concrete class, then, we can bind it to itself.`

1. No Bindings
2. Bindings to itself

```java
bind(TypeA.class).to(SubClassOfTypeA.class);
```

# Images

![img.png](Object Graph.png)
![img.png](img.png)
![img_1.png](img_1.png)
![img_2.png](img_2.png)

# @BindingAnnotation vs @Named

- @BindingAnnotation is a custom annotation that you create.
- @Named is a built-in annotation that comes with Guice.
- They can be used interchangeably.

# @BindingAnnotation vs @Qualifier

- @BindingAnnotation is a custom annotation that you create.
- @Qualifier is a built-in annotation that comes with Guice.
- They can be used interchangeably.
- Older code may still use Guice `BindingAnnotation` in place of the standard `Qualifier` annotation.
- `@Qualifier` annotation. New code should use `@Qualifier` instead.

# toInstance

- `bind(String.class).toInstance("jdbc:mysql://localhost/pizza");`
- bindConstant() is a shortcut for toInstance() for primitive types and strings.

