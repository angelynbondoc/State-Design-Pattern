# State-Design-Pattern

A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.

● Active accounts: Allow deposits and withdrawals.

● Suspended accounts: Disallow deposits and withdrawals transactions, but allow viewing account information.

● Closed accounts: Disallow all transactions and viewing of account information.

Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.


Implement the State pattern to improve code maintainability and flexibility:
  1. Define Account States: Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.
  2. Implement State Interface: Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.
  3. Implement State Behaviors: Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions.
  4. Update Account Class:
    ○ Include attributes for accountNumber and balance.
    ○ Remove state-specific logic from the Account class.
    ○ Introduce a reference to the current AccountState object.
    ○ Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.
