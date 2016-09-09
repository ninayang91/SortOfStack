# SortOfStack

Sort a stack in ascending order, only one additional stack could be used

Create a stack s, make s in ascending order, return s

pop value temp from stack, while(s is not empty && s.peek()>temp) stack.push(s.pop())

otherwise, s.push(temp)
