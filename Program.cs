using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //string name;
            //name = "hello";
            //Console.WriteLine(name);
            //string ret = Console.ReadLine();
            //Console.WriteLine(name + ret);


            /*string strdata = "정말로 반가워!! 행복한 하루";
            Console.WriteLine(strdata.IndexOf("반"));
            Console.WriteLine(strdata.IndexOf("행복"));

            Console.WriteLine(strdata.Contains("!!"));
            Console.WriteLine(strdata.Contains("하루들"));

            strdata = strdata.Replace("행복한", "즐거운");
            Console.WriteLine(strdata);

            string strdata2 = "Happy Day. Good!!";
            Console.WriteLine(strdata2.ToUpper());
            Console.WriteLine(strdata2.ToLower());
            Console.WriteLine(strdata2.Insert(5,"hi"));
            Console.WriteLine(strdata2.Remove(2,3));
            Console.WriteLine(strdata2.Remove(7));*/

            Cast.CastStrung();
        }
    }

    internal class Cast
    {
        public static void CastStrung()
        {
            float num1 = 3.14159f;
            int retvalue = 0;

            Console.WriteLine("원본 실수 num1 = {0}", num1);
            Console.WriteLine("원본정수 retvalue = {0}", retvalue);

            retvalue = (int)num1;
            Console.WriteLine("실수 num1 값 {0}", num1);
            Console.WriteLine("정수값 retvalue {0}", retvalue);

            num1 = (float)retvalue;
            Console.WriteLine("실수 값 = {0:F5}", num1);

            int num = 33;
            string val1;
            val1 = "" + num;
            Console.WriteLine(val1);

            num = 77;
            val1 = num.ToString();
            Console.WriteLine(val1);

            float num2 = 3.14159f;
            val1 = string.Format("{0} {1:F2}", num, num2);
            Console.WriteLine("값1 {0}, val1");
        }
    }

}
