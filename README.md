
# Haifa Animal Kingdom (Java OOP Design)

## 📖 Problem Description
On an imaginary planet named **Haifa**, the Animal Kingdom has only **3 categories**:

- **Mammal** → Cow, Camel  
- **Reptile** → Turtle, Crocodile  
- **Fish** → Shark, Tuna  

### Fields
- Every animal has a **weight** property (real number).  
- The weight must be `private` and `final`.  

### Behaviours
- **All animals** can breathe, but each category breathes differently.  
- **Mammals** can grow hair.  
- **Reptiles** bask in the sun.  
- **Fish** lay eggs.  
- **Mammals & Reptiles** can walk.  
- **Reptiles & Fish** can swim.  

### Constraints
- `Animal`, `Mammal`, `Reptile`, `Fish` must be **abstract classes**.  
- Use **interfaces** for `Walkable` and `Swimmable`.  
- No use of `instanceof`.  
- Proper **inheritance & polymorphism** to avoid duplicate code.  
- Each class/interface should be in its own file.  

---

## 🎯 Key OOP Concepts Used

* **Abstraction** → Abstract classes for category-level behavior (`Animal`, `Mammal`, `Reptile`, `Fish`).
* **Encapsulation** → `weight` is private & final, accessed via getter.
* **Inheritance** → Species extend their respective categories.
* **Polymorphism** → Runtime method dispatch (`breathe`, `growHair`, `baskInSun`, `layEggs`).
* **Interfaces** → `Walkable`, `Swimmable` for shared behaviors across categories.

---