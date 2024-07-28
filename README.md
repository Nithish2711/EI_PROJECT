


# EI_CODING_ASSESSMENT (NITHISH S- 21IT072)

# Exercise1

## *Behavioural pattern*

## Observer Pattern

***ObserverPatternDemo.java:***  Implement a weather monitoring system where multiple displays (observers) can register to receive updates from a weather station whenever the weather data changes.

![image]

## Strategy pattern

***StrategyPatternDemo.java:*** Implement a payment system where different payment strategies (credit card, PayPal, bank transfer) can be used interchangeably.

![image]

## *Creational pattern*

## Singleton Pattern

***ConfigurationManager.java:*** Implements a singleton class for managing configuration settings, ensuring only one instance exists. 

***SingletonPatternDemo.java:*** Demonstrates using the ConfigurationManager singleton to show consistent configuration updates across instances.

![image]

## Factory pattern

***FactoryMethodPatternDemo.java:*** Create a system that produces different types of documents (PDF, Word, Excel) using a factory method.

![image]

## *Structural pattern*

## Adaptor pattern

***AdapterPatternDemo.java:*** Integrate a legacy logging system with a new logging framework using an adapter.

![image]

## Decorator pattern

***DecoratorPatternDemo.java:*** Decorate a basic coffee with additional features (milk, sugar, etc.) using decorators.

![image]

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

![image]

*Remove Task:*  Enter the description of the task to remove.

![image]

*View Tasks:*  Displays all tasks sorted by start time.

![image]

*Exit:*  Terminates the application.

![image]


