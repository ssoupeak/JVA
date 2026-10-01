using System;

namespace da
{
    internal class Program
    {
        class BaseClass
        {
            public int m_x;
            public new void showData()
            {
                Console.WriteLine("부모객체함수" + m_x);
            }

            class SubClass : BaseClass
            {
                public new int m_x;
                public int m_y;
                public new void showData()
                {
                    m_x = 77;
                    Console.WriteLine("자식 객체 함수" + m_x);
                    Console.WriteLine("자식 객체 함수" + m_y);
                }

                public void Show()
                {
                    showData();
                    base.m_x = 123;
                    base.showData();
                }

                static void Main(string[] args)
                {
                    BaseClass pbase = new BaseClass();
                    pbase.showData();

                    SubClass pusb = new SubClass();
                    pusb.showData();
                    pusb.Show();
                }
            }
        class MyData
        {
            public int m_x, m_y;
            private int m_z;
            protected int m_abe;

            public MyData(int x, int y, int z)
            {
                Console.WriteLine("생성자 값 3개 세팅");
                m_x = x;
                m_y = y;
                m_z = z;
            }

            public MyData()
            {
                Console.WriteLine("생성자 : 값 없이 기본값으로 세팅");
            }

            public MyData(int x)
            {
                Console.WriteLine("생성자 값 1개 세팅");
                m_x = x;
                m_y=0;
                m_z = 0;
            }

            public MyData(int y = 33, int z = 66)
            {
                Console.WriteLine("생성자 값 2개 세팅");
                m_x = 3;
                m_y = y;
                m_z = z;
            }
            public void ShowData()
            {
                Console.WriteLine("내부 {0} {1} {2}", m_x, m_y, m_z);
            }

            static void Main(string[] args)
            {
                Console.WriteLine("클래수 변수 data");
                MyData data = new MyData();
                data.ShowData();

                Console.WriteLine("클래수 변수 data2");
                MyData data2 = new MyData(x: 123, z: 456, y: 000);
                data2.ShowData();

                Console.WriteLine("클래수 변수 data3");
                MyData data3 = new MyData(222,333);
                data3.ShowData();

                Console.WriteLine("클래수 변수 data4");
                MyData data4 = new MyData(z: 44);
                data4.ShowData();
            }
        }
    }
}
