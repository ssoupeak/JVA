namespace ConsoleApp1
{
    internal class Program
    {
        abstract class Haward_Stark
        {
            public int inteligence;
            public int num_company;
        }

        public void MakeArc_Reactor()
        {
            Console.WriteLine("부모 기술");
            Console.WriteLine("아크발전기");
        }
        abstract public void make_new_resouce_arc();

        class TonyStark : Haward_Stark
        {
            override public void make_new_resouce_arc()
            {
                Console.WriteLine("부모에 없는 기술");
                Console.WriteLine("신물질을 만든다");
            }

            public void MakeArc_Potable()
            {
                Console.WriteLine("개선된 재정의 기술");
                Console.WriteLine("휴대용 아크발전기");
            }
        }
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
            //HowardTech factory = new HowardTech();
            TonyStark tony = new TonyStark();
            tony.MakeReactor();
            Console.WriteLine("---------");
            //TonyTech ironMan = new TonyTech();
            tony.MakeReactor();
            Console.WriteLine("---------");
            tony.make_new_resouce_arc();
        }
    }
}
