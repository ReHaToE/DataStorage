/*

What do we need?

We need a program that will help us track which tires we changed,
for who we changed them and when we did that.






What does the program needs to do?

UC1 - Program needs to have an option to write information about client.
    * User writes in the program information about client.
UC2 - Program needs to have an option to search client.
    * User writes in the program information about client.
    * Program finds information about client and shows them to user.
UC3 - Program needs to have an option to write information about client´s car.
    * User writes in the program information about client´s car.
UC4 - Program needs to have an option to add, change and remove client´s car.
    * User writes in the program information about clients car.
    * User adds information about client´s car to a client.
    * User saves that information.
    ----------------------------------------------------------------------------
    * User writes in the program information about clients car.
    * User changes information about clients car.
    * User saves that information.
UC5 - Program needs to have an option to write information about changed tires.
    * User writes in the program information about changed tires.
UC6 - Program needs to have an option to write information about old tires.
    * User writes in the program information about old tires.
UC7 - Program needs to have an option to store in the garage old tires if the client wants that.
    * User selects if the client wants to store old tires.
    * Program checks if there is space to store old tires.
    * Program shows if there is space and if so, shows how much.
UC8 - Program needs to have an option to set date and time.
    * User writes in the program date and time when the change has taken place.
UC9- Program needs to be able to change all the information about the change.
    * User writes information about client.
    * Program finds information about client.
    * User changes information about client.
    * User saves that information.

Nonfuntional requirements:

UC1- Program needs to be able to store all the information in a file.
    * User writes all information about the change of tires.
    * User saves that information.
    * Program stores that information in a file.
*/



/*
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