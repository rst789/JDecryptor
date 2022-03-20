# Java Decryptor, Homework Requirement

Problem:
----------------
  A set of crooks have decided that it would really be cool to use a linked list to encrypt and decrypt messages that they send to each other. Your cyber defense team has been tasked with creating the decryption algorithm that will read encrypted text messages from a file and print out the decrypted message.

Proposed Solution:
----------------
  The code-cracker team has discovered the algorithm used by the crooks to encrypt their messages.
  They have discovered that the * has been used to show a space between words. Decrypting the words in a message has been reduced to the following operations - take each character of the message and store it in a linked list in the following fashion:

- Each letter is added to the linked list alternating between: 
  
  - adding to the front of the list 
  
  - Followed by adding to the end of the list
  
- At the end, the hidden message is obtained by printing out the contents of the linked list.


To automate the decryption process you need to:

- Identify the classes that you need for your solution

- Code the classes

- Code a driver class called Decryptor


The main method in your Decryptor should:

- read the texts from a test file called texts.txt

- decrypt each text in turn

- print out the decrypted text message

