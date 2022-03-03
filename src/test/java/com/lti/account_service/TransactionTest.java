package com.lti.account_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.LinkedList;
import java.util.List;import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class TransactionTest {
List<Account> accounts = new LinkedList<Account>();
Transaction tn = new Transaction(accounts); @BeforeEach
void setUp() throws Exception {
System.out.println("Initializing the sample data....");
accounts.add(new Account(1001, "Mahendra",23000D));
accounts.add(new Account(1002, "Sonali",29000D));
accounts.add(new Account(1003, "Dakshata",2100D));
} @AfterEach
void tearDown() throws Exception {
System.out.println("Cleaning / Deleting the sample ....");
accounts.clear();
} @Test
// Test Case : Deposit 3000 into Account 1001 Then Balance Expected is 26000
void testDeposit() {
tn.deposit(1001, 3000);
double amt = tn.findAccount(1001).getBalance();
// Verify that, Actual balance matches with 26000 (Expected)
// Error Margin of 0.01 ( 26000 == 25999.99 )
assertEquals(26000D,amt,.01);
}
@Test
// Test Case : Withdraw 3000 from Account 1001 Then Balance Expected is 20000
void testWithdraw() {
tn.withdraw(1003, 3000);
double amt = tn.findAccount(1001).getBalance();
assertEquals(20000D,amt,.01);
}}

