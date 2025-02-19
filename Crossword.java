 

public class Crossword
   {
   private Square[][] puzzle;
   
   public Crossword()
      {
      puzzle = new Square[5][5];  
      for(int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            puzzle[row][col] = new Square( true, 0 );    
            } // end inner for
         } // end outer for
         
         
      } // end zero-arg constructor
   
   public Crossword( boolean[][] blackSquares )
      {
       if(c != 0){
          if(blackSquares[r][c-1] == false && blackSquares[r][c] == false)
           {
            return false;
           }
        }
      else if (r != 0)
      {
        if(blackSquares[r+1][c] == false && blackSquares[r][c] == false)
        {
          return false;
        }
      }
      return true;
          
          
      // to be completed in Part (b)
      
      
      
      } // end one-arg constructor 
       
   private boolean toBeLabeled( int r, int c, boolean[][] blackSquares )
      {
       int blackColumn = blackSquares[0].length;
       int blackRow = blackSquares.length;
       Square [][] puzzle = new Square [blackRow] [blackColumn]();
       int counter = 0;
       for (int r = 0; r < puzzle.length; r++)
         {
          for(int c = 0; c < puzzle[0].length; c++)
            {
             if(toBeLabeled(r,c, blackSquares) == true)
              {
               puzzle[r][c].isBlack = false;
               counter+=1;
               puzzle[r][c].num = counter;
              }
             else{
               puzzle[r][c].isBlack = true;
               puzzle[r][c].num = 0;
              }
           }
        }
      } // end method toBeLabeled
      
   public String toString()
      {
      String output = new String();
      
      for( int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            if( puzzle[row][col].getIsBlack() == true )
               {
               output += (char)(9608) + "\t";   // 9608 adds a black square
               } 
            else
               {
                   output += puzzle[row][col].getNum() + "\t"; //prints number of square
               
               } // end else 
            } // end inner for
         output += "\n";      
         } // end outer for
      return output;  
      } // end method toString()
   } // end class Crossword
   
