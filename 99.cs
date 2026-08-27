using System;
using System.Runtime.ExceptionServices;

namespace KiiKii
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Cast.CastInt();
            ObjectType.Boxing();
            Stat.Ternary();
            Stat.Ternary2();
            Stat.Ternary3();
            Stat.Control();
        }
    }

    internal class Cast
    {
        public static void CastInt()
        {
            string val = "33";
            string val1 = "3.14";

            int ret = 0;
            float ret1 = 0;

            ret = int.Parse(val);
            Console.WriteLine("정수값 " + ret);
            ret1 = float.Parse(val);
            Console.WriteLine("실수값1 " + ret);
            double ret2 = double.Parse(val1);
            Console.WriteLine("실수값2 " + ret2);

            Console.WriteLine("");
            ret = Convert.ToInt32(val);
            ret1 = Convert.ToSingle(val1); //float
            Console.WriteLine("결과 {0:F4}", ret1);
        }
    }

    internal class ObjectType
    {
        public static void Boxing()
        {
            object box = 50;
            Console.WriteLine("박싱 값 : {0}", box);

            int unboxed = (int)box;
            Console.WriteLine("언박싱 값 : {0}", unboxed);

            unboxed += 5;
            Console.WriteLine("언박싱 계산 결과 : {0}", unboxed);

            Console.WriteLine("");
        }
    }

    internal class Stat
    {
        public static void Ternary()
        {

            string num = Console.ReadLine();
            int num1 = int.Parse(num);
            int abs;
            abs = (num1 > 0) ? num1 : num1 * (-1);
            Console.WriteLine(num + " 절대값 = " + abs);
        }

        public static void Ternary2()
        {
            int count = 0;
            Console.WriteLine("현재 카운트 값 {0}", count);

            while (count < 5)
            {
                Console.WriteLine("반복 " + count);
                count++;
            }

            Console.WriteLine("반복 완료");
            Console.WriteLine("");
        }

        public static void Ternary3()
        {
            Console.WriteLine("구구의 단 : ");
            string input_str = Console.ReadLine();
            int inputdan = int.Parse(input_str);

            for (int i = 1; i <= 9; i++)
            {
                Console.WriteLine("{0} * {1} = {2}", inputdan, i, i * inputdan);
            }
            Console.WriteLine("");
            for (int i = 2; i <= 9; i++)
            {
                Console.WriteLine("{0} 단", i);
                for (int j = 1; j <= 9; j++)
                {
                    Console.WriteLine("{0} * {1} = {2}", i, j, i * j);
                }
            }
        }


        public static void Control()
        {
            int i = 0;
            for (i = 0; i < 10; i++)
            {
                if (i == 8) break;
                if (i == 3) continue;
                Console.WriteLine(i);

            }
        }
    }
}
