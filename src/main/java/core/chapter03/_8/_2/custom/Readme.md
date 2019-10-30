Configuring Custom Constraints
Each Bean Validation constraint consists of two parts. 
First, a @Constraint annotation that declares the constraint and its configurable properties. Second, an implementation of the
javax.validation.ConstraintValidator interface that implements the constraint’s behavior. To
associate a declaration with an implementation, each @Constraint annotation references a
corresponding ConstraintValidator implementation class. At runtime, a ConstraintValidatorFactory
instantiates the referenced implementation when the constraint annotation is encountered in your
domain model.
By default, the LocalValidatorFactoryBean configures a SpringConstraintValidatorFactory that uses
Spring to create ConstraintValidator instances. This allows your custom ConstraintValidators to
benefit from dependency injection like any other Spring bean.
Shown below is an example of a custom @Constraint declaration, followed by an associated
ConstraintValidator implementation that uses Spring for dependency injection: