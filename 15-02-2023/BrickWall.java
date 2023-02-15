/********************************************Question*********************************/
Brick Wall

There is a rectangular brick wall in front of you with n rows of bricks. The ith row has some number of bricks each of the same height (i.e., one unit) 
but they can be of different widths. The total width of each row is the same.

Draw a vertical line from the top to the bottom and cross the least bricks. If your line goes through the edge of a brick, then the brick is not considered as crossed. 
You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks.

Given the 2D array wall that contains the information about the wall, return the minimum number of crossed bricks after drawing such a vertical line. 

  
Example 1:
Input: wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
Output: 2
  
  
Example 2:
Input: wall = [[1],[1],[1]]
Output: 3
 

Constraints:
n == wall.length
1 <= n <= 104
1 <= wall[i].length <= 104
1 <= sum(wall[i].length) <= 2 * 104
sum(wall[i]) is the same for each row i.
1 <= wall[i][j] <= 231 - 1
  
Program:
class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> result = new HashMap<>();//initialize the empty hashmap.
        for(List<Integer> l:wall)
        {
            int sum=0;
            for(int i=0;i<l.size()-1;i++)
            {
                sum+=l.get(i);//get the sum of the elements in each iteration.
                /*int count=1;
                if(result.containsKey(sum))
                    count=(int)result.get(sum)+1;
                result.put(sum,count);*/
                result.put(sum,result.getOrDefault(sum,0)+1);//whether the map already contains the particular key(sum) increase the count by 1 otherwise initialize the count as 1.
            }
        }
        int max = 0;
        for(Integer val:result.values())
            max=Math.max(max,val);//find max no of wall meet at same position.if more no of walls meet at same position,then  we need to break less no no of walls.
        return wall.size()-max;
    }
}
public class BrickWall
{
  public static void main(String args[])
  {
    BrickWall ob = new BrickWall();
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    ArrayList<ArrayList<Integer>> wall = new ArrayList<ArrayList<>>();//create a 2D empty arraylist
    for(int i=0;i<row;i++)
    {
      wall.add(new ArrayList<Integer>());//create a space for a particular row in arraylist.
      int col = sc.nextInt();
      for(int j=0;j<col;j++)
          wall.get(i).add(j,sc.nextInt());//add the element into the arraylist at the specified index(i,j).
    }
    int val = leastBricks(wall);
    System.out.println(val);
  }
}
    
        
        
        
