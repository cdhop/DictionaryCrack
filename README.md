## DictionaryCrack

A dictionary file based password cracking program implemented in Java

Like [BruteCrack](http://github.com/cdhop/BruteCrack), this is more of a proof of concept/academic exercise in password cracking, than a serious application to crack real-world passwords.

This program accepts a MD5 hash as a parameter and tries all the entries found in a dictionary file by hashing them and then comparing the results against the passed hash.  If a match is found, then the application will output the dictionary entry which resulted in a match.

Unlike the BruteCrack program, this program will find (or not find) the password very quickly.  Hopefully, no real-world passwords are still hashed and stored using MD5 (Google: 'Password Salting').  

This program demonstrates the importance of using a password that is not a commonly used or obvious word in a Dictionary.  The combination of special characters, upper and lower-case alphabetical characters, and numbers will defeat most dictionary-based cracking programs and force a much more resource intensive brute force attack.
