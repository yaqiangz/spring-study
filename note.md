## 注解说明
- @AutoWired: 通过类型自动装配. 如果Autowired不能通过名字唯一自动装配上属性, 则需要通过@Qualifier(value="xxx")
- @Nullable: 字段标记了这个注解说明这个字段可以为null
- @Resource: 通过名字, 类型自动装配
- @Component: 组件, 放在类上说明类被Spring管理了