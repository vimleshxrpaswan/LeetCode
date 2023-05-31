package leetcodeprac;

class PalindromeLogic {
        public static void main(String args[]){
            int rem,sum=0,temp;
            int n=1331;

            temp=n;
            while(n>0){
                rem=n%10;
                sum=(sum*10)+rem;
                n=n/10;
            }
            if(temp==sum)
                System.out.println("palindrome hai");
            else
                System.out.println("not palindrome");
        }
    }


