


# EI_CODING_ASSESSMENT (NITHISH S- 21IT072)

# Exercise1

## *Behavioural pattern*

## Observer Pattern

***ObserverPatternDemo.java:***  Implement a weather monitoring system where multiple displays (observers) can register to receive updates from a weather station whenever the weather data changes.

![image](https://github.com/user-attachments/assets/4b2fdc57-f728-4f18-b828-d6cdb39b17a8)

## Strategy pattern

***StrategyPatternDemo.java:*** Implement a payment system where different payment strategies (credit card, PayPal, bank transfer) can be used interchangeably.

![image](https://github.com/user-attachments/assets/97560edb-efc3-4db3-8b67-bde290c6b4d4)

## *Creational pattern*

## Singleton Pattern

***ConfigurationManager.java:*** Implements a singleton class for managing configuration settings, ensuring only one instance exists. 

***SingletonPatternDemo.java:*** Demonstrates using the ConfigurationManager singleton to show consistent configuration updates across instances.

![image](https://github.com/user-attachments/assets/9c095ca3-dab4-4c30-89c3-386441ed4024)

## Factory pattern

***FactoryMethodPatternDemo.java:*** Create a system that produces different types of documents (PDF, Word, Excel) using a factory method.

![image](https://github.com/user-attachments/assets/f7b075f7-e72a-4f9c-ba1e-4d6eddfcf73e)

## *Structural pattern*

## Adaptor pattern

***AdapterPatternDemo.java:*** Integrate a legacy logging system with a new logging framework using an adapter.

![image](https://github.com/user-attachments/assets/120a6eb9-65db-45ac-b2b7-9f6236f2c27a)

## Decorator pattern

***DecoratorPatternDemo.java:*** Decorate a basic coffee with additional features (milk, sugar, etc.) using decorators.

![image](https://github.com/user-attachments/assets/1c0dd3d8-d9ee-40cb-a6ea-94eb6827d2cc)

# Exercise2

# Astronaut Scheduler

A console-based Java application designed to help astronauts manage their daily schedules. Users can add, remove, and view tasks, ensuring no time conflicts.


## Features

Add a new task with a description, start time, end time, and priority level.

Remove an existing task by its description.

View all tasks sorted by start time.

Ensure that new tasks do not overlap with existing tasks.


## Design Patterns Used

*Singleton Pattern:* Ensures only one instance of the ScheduleManager.

*Factory Pattern:* Provides a factory method for creating Task objects.

*Observer Pattern:* Notifies users of task conflicts.

## Classes

*AstronautScheduler:*  Main class that runs the application and handles user input.

*Task:*  Represents a task with attributes such as description, start time, end time, and priority.

*ScheduleManager:*  Manages the list of tasks, ensuring no overlaps and maintaining order.

*TaskFactory:*  Provides a way to create Task objects.

*Observer:*  Defines the observer interface.

*TaskObserver:*  Abstract class implementing the Observer interface.

*TaskConflictObserver:*  Concrete observer class for handling task conflict notifications.

## Usage

*Add Task:*  Follow the prompts to enter the task description, start time, end time, and priority.

![image](https://github.com/user-attachments/assets/97142a11-4147-4aee-bb4c-12d6344166a9)

![image](https://github.com/user-attachments/assets/79255879-ab3e-4940-a0fa-3966ebbf94b3)

![image](https://github.com/user-attachments/assets/a67f801d-9e95-4e67-be2a-9d2abdd5d159)

*Remove Task:*  Enter the description of the task to remove.

![image](https://github.com/user-attachments/assets/5c4b343b-39e8-4d74-93cc-e27740b2cbd4)

*View Tasks:*  Displays all tasks sorted by start time.

![image](https://github.com/user-attachments/assets/f5e75efd-573a-4616-aab2-20cc70b3b2bf)

*Exit:*  Terminates the application.

![image](https://github.com/user-attachments/assets/7deeb2ba-ea97-4e51-b2c0-3adf1a34cf1f)



