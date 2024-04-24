SOLID

SOLID is a set of principles applied to object-oriented design (OOD) to create maintainable, understandable, and flexible code, while avoiding code smells and defects. The principles are:

    Single Responsibility
    Open/Closed
    Liskov Substitution
    Interface Segregation
    Dependency Inversion

Visit the following resources to learn more:

    SOLID Principles
    SOLID: The First 5 Principles of Object Oriented Design

    https://www.baeldung.com/solid-principles
    
    https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design
    
    ------
    
    Single Responsibility

Let’s begin with the single responsibility principle. As we might expect, this principle states that a class should only have one responsibility. Furthermore, it should only have one reason to change.

How does this principle help us to build better software? Let’s see a few of its benefits:

    Testing – A class with one responsibility will have far fewer test cases.
    Lower coupling – Less functionality in a single class will have fewer dependencies.
    Organization – Smaller, well-organized classes are easier to search than monolithic ones.
    
    ---------------------
    
 open-closed principle -> Open for Extension, Closed for Modification   
 
 It’s now time for the O in SOLID, known as the open-closed principle. Simply put, classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.
 
 extender ao inves de alterar
 
 ---------
 Liskov Substitution
 
 mais complexo deixar pro final
 
 ----
 Interface Segregation
 
 The I  in SOLID stands for interface segregation, and it simply means that larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.
 
 dividir uma interface com mais metodos em 1 interface com 1 metodo cada, dessa forma vc pode implementar apenas os metodos que vc quer 
 
 mas se eu quiser garantir que todas as implementações implementem os metodos?
 
 ------------------
 Dependency Inversion
 
 ao inves de injetar uma classe, injetar a interface. Permite que a funcionalidade seja extendida caso necessario.
 nao fica preso apenas a um tipo/implementacao.
 
 estudar +  Dependency Inversion vs dependency Injection
 
 https://medium.com/@inzuael/solid-dependency-inversion-principle-part-5-f5bec43ab22e
 
 It is a principle whose name is often misused interchangeable with Dependency Injection even it is not the same. Dependency Injection is an Inversion of Control technique for supplying objects (“dependencies”) to a class by a way of the Dependency Injection Design Pattern. Typically passing dependencies via constructor or field. In contrast the Dependency Inversion Principle is a general design guideline which recommends that classes should only have direct relationships with high-level abstractions. So to make things more clear let’s start having a look at the principle.
 
 Depend on abstractions, not on concretions.
 
 O DIP ou Dependency Inversion Principle (Princípio da Inversão de Dependência) prega que devemos depender de abstrações e não de implementações.
 
 https://balta.io/blog/dependency-inversion-principle
 
 O princípio da inversão de dependência diz que devemos depender de abstrações (interfaces) ao invés de implementações (classes concretas) a fim de ter um menor acoplamento entre as camadas do sistema.

Embora esteja relacionado a DI (Dependency Injection) e IoC (Inversion of Control) o DIP é diferente em diversos aspectos.
 
 
 
 
 
    