class BankTransactionAppln
{
        int currentbalance=10000;
        int withdrawamt=5000;
        int depositamt=2000;
        public void withdrawAmount()
        {
                currentbalance=currentbalance-withdrawamt;
                System.out.println("After Withdraw..."+currentbalance);
        }
        
        public void depositAmount()
        {
                currentbalance=currentbalance+depositamt;
                System.out.println("After Deposit..."+currentbalance);
   
         }                
}         