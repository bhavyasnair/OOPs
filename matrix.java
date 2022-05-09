import java.util.*;
class matrix
{
 public static void main(String[] args)
{
int m,n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of rows:");
m=sc.nextInt();
System.out.println("Enter the no of coloumns:");
n=sc.nextInt();
int mat1[][]=new int[m][n];
int mat2[][]=new int[m][n];
int mat3[][]=new int[m][n];
System.out.println("enter the first matrix elememts :");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
mat1[i][j]=sc.nextInt();
System.out.println("enter the second matrix elememts :");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
mat2[i][j]=sc.nextInt();
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
 mat3[i][j]=mat1[i][j]+mat2[i][j];
}
}
System.out.println("The resultant matrix is :");
for(i=0;i<m;i++)
{

for(j=0;j<n;j++)
{

System.out.print(mat3[i][j]+" ");
//System.out.println("\t");
}
System.out.println();
}
}
}
