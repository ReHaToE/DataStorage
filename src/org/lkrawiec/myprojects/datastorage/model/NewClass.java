/*

1. What do we need?

We need a program that will help us track which tires we changed,
for who we changed them and when we did that.

2. What does the program needs to do?

UC1 - Adding a new change.
    * User chooses option to ¨Add new change¨.
    * Program shows a form to the user.
    * User fills information about new change - information about
      client (name, address, phone number, email)
      client´s car (brand, model, license plates, mileage)
      new tires (for each tire: profile, size, brand, model, pressure)
      old tires (for each tire: profile, size, brand, model)
      store old tires (yes/no)
      date (mm/hh/dd/mm/yyyy)
    * User confirms information about new change.
    * Program saves information about new change.
UC2 - Searching the car.
    * User chooses option to ¨Search car¨.
    * Program shows a form to find the car.
    * User fills license plates of the car.
    * Program shows information about car -
      brand, model, license plates, mileage.
UC3 - Searching history of the car
    Prerequisite: UC2
    * User chooses to see car´s history of changes.
    * Program shows history of changes for the given car (by date/mileage).
    * User chooses change from a history (date/mileage).
    * Program shows information about chosen change.
*/