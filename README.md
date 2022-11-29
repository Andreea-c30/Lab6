Laboratory work 6 Description  

All things considered in laboratory nr.6 I implemented SOLID principles in order to manage the code more effectively and from a logical point of view.
Creating separate classes for each domain in order to respect the Single responsible principle. I modified the data from classes, in case we want to add new functions, it would nout create any bugs to the existing code. 
According to the interface segregation and dependancy inversion principles I used small interfaces and abstract classes, so the details will depend on abstraction not on concrete classes.

I have implemented MVC architecture and organized all the modules into data - Models, view and logical - Controllers. In this way I have the logic separated from the data and the view and is more manageble and organized.
The main class containg main information and executable information about the simulation so it contains the functions calling, I divided into 3 classes in order to repsect the single responsibility principle. Now the main class is MCVMain.java, which needs to be executed in order to start the simulation.