# 3.8.3. Configuring a DataBinder
Since Spring 3, a DataBinder instance can be configured with a Validator. 
Once configured, the Validator may be invoked by calling `binder.validate()`.
Any validation Errors are automatically added to the binder’s `BindingResult`.