Key Classes

1. TravelAgency
   - Attributes:`name`, `location`, `contactInfo`
   - Methods: `addPackage()`, `removePackage()`, `createBooking()`
   - Encapsulation:Use private attributes and provide public getter and setter methods for secure access.
   
   ```java
   class TravelAgency {
       private String name;
       private String location;
       private String contactInfo;

       public String getName() { return name; }
       public void setName(String name) { this.name = name; }
       // Other getters and setters...
   }
   ```

2. Customer
   - Attributes: `customerID`, `name`, `email`, `phone`
   - Methods: `register()`, `login()`, `searchPackages()`, `bookTrip()`
   - Encapsulation: Attributes can be private, with methods to interact with them.
   
   ```java
   class Customer {
       private String customerID;
       private String name;
       private String email;
       private String phone;

       public void register() { /* registration logic */ }
       // Other methods...
   }
   ```

3. TravelPackage
   - Attributes: `packageID`, `destination`, `price`, `itinerary`
   - Methods:`updateDetails()`, `getPrice()`, `checkAvailability()`
   - Polymorphism:Method overriding to provide specific behavior in subclasses.
   
   ```java
   class TravelPackage {
       public double getPrice() {
           return price; // Default implementation
       }
   }

   class LuxuryTravelPackage extends TravelPackage {
       @Override
       public double getPrice() {
           return super.getPrice() * 1.5; // Luxury package pricing
       }
   }
   ```

4. Booking
   - *Attributes:* `bookingID`, `customerID`, `packageID`, `bookingDate`
   - Methods:`confirmBooking()`, `cancelBooking()`, `getBookingDetails()`
   - Encapsulation:Use private fields and provide methods for booking management.
   
   ```java
   class Booking {
       private String bookingID;
       // Other attributes...

       public void confirmBooking() { /* confirmation logic */ }
       // Other methods...
   }
   ```

5. Payment
   - Attributes:`paymentID`, `amount`, `paymentDate`, `paymentMethod`
   - Methods: `processPayment()`, `refundPayment()`
   - Polymorphism:Different payment methods can extend a base class.
   
   ```java
   abstract class Payment {
       public abstract void processPayment();
   }

   class CreditCardPayment extends Payment {
       @Override
       public void processPayment() {
           // Process credit card payment
       }
   }
   class PayPalPayment extends Payment {
       @Override
       public void processPayment() {
           // Process PayPal payment
       }
   }
   ```
6. Feedback
   - Attributes:feedbackID`, `customerID`, `bookingID`, `comments`, `rating`
   - Methods:`submitFeedback()`, `viewFeedback()`
   - Encapsulation:Keep attributes private and provide appropriate methods.

Findings

- *Encapsulation*: Each class encapsulates its data, ensuring that attributes are protected from direct access, which promotes data integrity and security.
- *Polymorphism*: The ability to define methods in a base class and override them in derived classes allows for flexible and reusable code, particularly in payment processing and package pricing. TravelAgency-by-JavaScript-
