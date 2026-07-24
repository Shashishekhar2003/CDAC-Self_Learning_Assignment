using System;

namespace Q3_Exceptions_Events
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Bank b = new Bank();

            b.LowBalance += Message;

            b.Withdraw(100);
        }

        static void Message()
        {
            Console.WriteLine("Message has been Sent");
        }
    }

    class Bank
    {
        public event Action LowBalance;

        public void Withdraw(int balance)
        {
            try
            {
                if (balance < 500)
                    throw new Exception("Low Balance!");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                LowBalance?.Invoke();
            }
        }
    }
}