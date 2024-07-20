# Producer_Consumer_Problem
It is an famous multithreading problem 

# Problem statement
We have a buffer of fixed size one. A producer can produce an item and can place in the buffer. A consumer can pick items and can consume them. We need to ensure that when a producer is placing an item in the buffer, then at the same time consumer should not consume any item. In this problem, buffer is the critical section. 

# Approach
Just we need to sync both producer and consumer thread so that if producer is producing something consumer thread go to wait state and when producer done with producing it notify to consumer thread and consumer thread can now consume that data and some goes when consumer thread is consuming
