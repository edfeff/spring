> spring使用PropertyEditor来进行bean的属性转换。
>
> 如果需要自定义PropertyEditor时，有一些机制：
> 1. ConfigurableBeanFactory的 registerCustomEditor 方法
> 2. 特殊的Bean factory后处理器 CustomEditorConfigurer 
> 3. 使用PropertyEditorRegistrar