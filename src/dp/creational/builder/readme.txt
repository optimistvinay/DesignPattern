Builder Pattern used to create a object with lot of parameter in the constructor.
We want the object the be immutable after constructing it.

Example of builder in java APi is StringBuilder

People create multiple constructor with different parameter variation. This is knows an Telescoping constructor. 
Builder pattern will help overcome this issue.

This will create usually by static inner class. but that is not mandatory.

We can have the flexibility to create object usingn any number of property. You don't need to have data constructor for all those combination.

 