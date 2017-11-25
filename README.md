# Cipher-Algorithms
These are just simple encryption/decryption algorithms, they are maybe useful for those whose taking Information security course.

# How does Caesar cipher work?
The Caesar cipher, also known as a shift cipher, is one of the simplest forms of encryption. It is a substitution cipher where each letter in the original message (called the plaintext) is replaced with a letter corresponding to a certain number of letters up or down in the alphabet. 
In this way, a message that initially was quite readable, ends up in a form that can not be understood at a simple glance. 

# How does Affine cipher work?
The affine cipher is a type of monoalphabetic substitution cipher, wherein each letter in an alphabet is mapped to its numeric equivalent, encrypted using a simple mathematical function, and converted back to a letter. The formula used means that each letter encrypts to one other letter, and back again, meaning the cipher is essentially a standard substitution cipher with a rule governing which letter goes to which. As such, it has the weaknesses of all substitution ciphers. Each letter is enciphered with the function (ax + b) mod 26, where b is the magnitude of the shift.

# How does Vigenère cipher work?
Simplest polyalphabetic substitution cipher, effectively multiple caesar ciphers, key is multiple letters long K = k1 k2 ... kd and ith letter specifies ith alphabet to use, then repeat from start after d letters in message.
*In this repo I used vigenere table, to learn more about the table -> http://pages.mtu.edu/~shene/NSF-4/Tutorial/VIG/Vig-Base.html

# How does AutoKey cipher work?
This cipher is based on Vigenère cipher, the only difference here is that instead of repeating the key, we will put the key as prefix to the message or the plain text that user wants to encrypt.

# How does Playfair cipher work?

# How does Row Transportations cipher work?
