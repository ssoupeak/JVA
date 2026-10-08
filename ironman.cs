namespace ConsoleApp1
{
    internal class Program
    {
        public class HowardTech
        {
            public virtual void MakeReactor()
            {
                Console.WriteLine("일반 기술");
            }
        }

        public class TonyTech : HowardTech
        {
            public override void MakeReactor()
            {
                Console.WriteLine("고급 기술");
            }
        }

        static void Main(string[] args)
        {
            HowardTech factory = new HowardTech();
            factory.MakeReactor();
            Console.WriteLine("---------");
            TonyTech ironMan = new TonyTech();
            ironMan.MakeReactor();
        }
    }
}
