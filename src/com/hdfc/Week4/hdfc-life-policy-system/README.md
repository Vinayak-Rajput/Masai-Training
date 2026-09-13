# HDFC Life Policy System

A modular Java console example for creating life-insurance policies, calculating premiums, filing claims, and publishing claim notifications. The project demonstrates layered design, SOLID principles, and common object-oriented design patterns.

## Features

- Creates term-life, ULIP, and endowment policies through a factory
- Stores and looks up policies with `PolicyStore`
- Calculates premiums using interchangeable strategies
- Validates and processes claims through `ClaimService`
- Publishes claim events to in-app and branch-letter observers
- Demonstrates custom exceptions, iterators, maps, and priority queues
- Seeds representative policies and claims from `com.hdfclife.Main`

## Source layout

```text
src/com/hdfclife/
├── Main.java
├── model/       Policy, policy types, Claim, and status enums
├── store/       PolicyStore
├── config/      AppConfig and application wiring
├── factory/     PolicyFactory
├── strategy/    Premium calculation strategies
├── observer/    Claim publisher and notification observers
├── service/     ClaimService and AuditLogger
└── exception/   Domain-specific service exceptions
```

## Design patterns

| Pattern | Usage |
| --- | --- |
| Factory | `PolicyFactory` centralizes creation of policy subtypes |
| Strategy | `PremiumStrategy` allows policy-specific premium calculations |
| Observer | `ClaimEventPublisher` notifies registered claim observers |
| Singleton | `AppConfig.INSTANCE` provides shared application configuration |
| Builder | `Claim.ClaimBuilder` creates claims with optional details |

## SOLID principles

- **Single Responsibility:** storage, claim processing, calculation, and creation are separated into dedicated classes.
- **Open/Closed:** new policy types, premium strategies, and observers can be added through existing abstractions.
- **Liskov Substitution:** concrete policy types can be used wherever `Policy` is expected.
- **Interface Segregation:** `PremiumStrategy` and `ClaimObserver` expose small, focused contracts.
- **Dependency Inversion:** services depend on strategy and publisher abstractions rather than notification implementations.

## Running

This directory is an independent source tree. Open it as a Java project and run `com.hdfclife.Main` from an IDE configured with a compatible JDK. The demonstration method seeds policies, calculates a ULIP premium, files claims, exercises observer notifications, and prints handled error cases.

The current examples use a no-argument `static void main()` demonstration method rather than the conventional `main(String[] args)` launcher signature, so configure the IDE run target accordingly or add the standard launcher signature when compiling from the command line.
