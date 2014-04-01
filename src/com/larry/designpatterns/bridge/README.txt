## DESCRIPTION OF BRIDGE PATTERN
## AUTHOR: LARRY PHAM
## SINCE 2014.04.01
## Object Oriented Design Learning Tutorial

Motivation: Sometimes, an abstraction should have different implementations; consider an object that handles persistence of objects
over different platforms using either relational databases or file system structure. A simple implementation might choose to extend
the object itself to implement the functionality for both file system and RDBMS. However this implementation would create a problem;
Inheritance binds a implementation to the abstraction and thus it would create a problem; Inheritance binds an implementation to the
abstraction and thus it would be difficult to modify, extend, and reuse abstraction and implementation independently.

Intent: the intent of this pattern is to decouple abstraction from implementation so that the two can vary independently.

The Bridge Pattern described how to integrate the attributes or properties of the given object but It don't have
more longed properties from other class. So we should create the bridge class(ex: Display Class) which inclued
the needed methods(behaviors) which the Counter object should be needed.
