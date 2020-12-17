/*Given a string S as input. You have to reverse the given string.

Input: First line of input contains a single integer T which denotes the number of test cases. T test cases follows, first line of each test case contains a string S.

Output: Corresponding to each test case, print the string S in reverse order.

Constraints:
1 <= T <= 100
3 <= length(S) <= 1000

Example:
Input:
3
Geeks
GeeksforGeeks
GeeksQuiz

Output:
skeeG
skeeGrofskeeG
ziuQskeeG
*/
#include <bits/stdc++.h> 
using namespace std; 

void reverse(string &str)
{
    int left=0;
    int right=str.length()-1;
    while(left<right)
    {
        //string temp="";
        //t//emp=str[left];
        //str[left]=str[right];
        //str[right]=temp;
        swap(str[left],str[right]);
        left++;
        right--;
    }
    cout<<str<<endl;
}
int main()
 {
     int testcases;
     cin>>testcases;
     while(testcases--)
     {
     string s;
     cin>>s;
     reverse(s);
         
     }
	//code
	return 0;
}
