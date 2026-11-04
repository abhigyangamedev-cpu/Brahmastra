DATA SEGMENT
    A       DB      25H
    D       DB      24H
    SUM     DB      ?
    CARRY   DB      00H
DATA ENDS
                              
CODE SEGMENT
    ASSUME CS:CODE , DS:DATA
    
START:
      MOV AX, DATA      ; INITIALISE DS
      MOV DS, AX
    
      MOV AL, A         ; TAKE 1ST NUMBER INTO A
      ADD AL, D         ; ADD 2ND NUMBER TO A
      JNC SKIP          ; IF NO CARRY THEN SKIP
      INC CARRY         ; ELSE INCREMENT CARRY
SKIP: MOV SUM, AL       ; STORE SUM

      MOV AH, 4CH       ; END THE PROGRAM... GO BACK TO DOS
      INT 21H
CODE ENDS
ENDS START
    
    
    
     



