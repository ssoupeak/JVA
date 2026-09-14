using System;
using System.ComponentModel.Design;
using System.Runtime.Serialization;

namespace ConsoleApp1
{
    internal class Program
    {
        enum Month
        {
            Jan,
            Fab,
            March,
            April,
            May
        } 

        enum GameState
        {
            Title, Meny = 100, Option, Game= 200, LoadGame,
            Exit=300,Quit
        }

        static void Main(string[] args)
        {
            Month my_mon;
            Month cur_mon;

            my_mon = Month.Jan;
            cur_mon = (Month)3;

            Console.WriteLine("달력의 월 : {0}, 현재 월 : {1}", my_mon, cur_mon);
            Console.WriteLine("세팅된 월 숫자 {0}", (int)my_mon);
            Console.WriteLine("현재 월 숫자 {0}", (int)cur_mon);

            GameState gameState;
            gameState = GameState.Title;
            while (gameState != GameState.Quit)
            {
                switch (gameState)
                {
                     case GameState.Title:
                        Console.WriteLine("현상태"+gameState);
                        gameState = GameState.Game; break;
                     case GameState.Game:
                        Console.WriteLine(gameState);
                        gameState = GameState.Exit; break;
                     case GameState.Exit:
                        Console.WriteLine(gameState);
                        gameState= GameState.Quit; break;
                }
            }
        }
    }
}
