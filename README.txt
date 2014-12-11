A demonstration of the GOF Decorator design pattern. A discount is decorated depending on the discount type to be applied. The discount is decorated with the various applicable discounts at run time.

Intent: Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

Benefits: More flexible than static inheritance. Avoids function-laden classes high up the hierarchy.

Limitations: A decorator and its components aren't identical. Lots of little objects.

Applicability: 
- To add responsibilies to individual objects dynamically and transparantly, without afftecting other objects.
- For responsibilities that can be withdrawn.
- When extention by subclassing is impractical. Sometimes a large number of independent extentions are possible and would produce an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise unavailable for subclassing.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/singleton/etc/singleton_1.png "Singleton")
