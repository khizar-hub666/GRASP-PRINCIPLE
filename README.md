Pros (Advantages) of Creator Principle
Loose Coupling

The class that needs an object doesn’t directly create it. Instead, a separate factory or method handles creation, making the code modular and flexible.
Better Maintainability

If object creation logic changes (e.g., switching from new Order() to getting an object from a database), you only need to update the creator method, not multiple places in the code.
Improved Readability & Organization

The code is cleaner and easier to understand since object creation is handled in one place instead of scattered across multiple files.
Enhances Reusability

The factory or creator method can be reused anywhere in the project, reducing duplicate code.
Encapsulation of Complex Creation Logic

If an object requires pre-processing (like setting default values or configurations), the creator method can handle it before returning the object.
Cons (Disadvantages) of Creator Principle
Increases Complexity

Introducing a separate creator class or factory method adds extra files and logic, which might be unnecessary for simple object creation.
May Be Overkill for Simple Objects

If object creation is straightforward (e.g., new User("John")), using a factory might add unnecessary abstraction.
Slight Performance Overhead

Calling a factory method instead of new directly adds a small overhead, though usually negligible in most applications.
More Boilerplate Code

Instead of new Order(), you have to define a factory method, which adds extra lines of code.
