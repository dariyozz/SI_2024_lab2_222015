<h1>Втора лабораториска вежба по Софтверско инженерство</h1>
<h2>Дарио Јаковлески бр. на индекс 222015</h2>

<h3>Барање 2: Control Flow Graph</h3>

![CFG link](https://github.com/dariyozz/SI_2024_lab2_222015/assets/134236483/bf8fd377-d4cb-4b8c-9554-8d3b14a21a96)

<h3>Барање 3: Цикломатска комплексност</h3>
<p>Цикломатска комплексност е 13, а тое може да се добие на повеќе начини, јас ја добив така што ги изброив регионите.</p>

<h3>Барање 4: Тест случаи според критериумот Every branch</h3>

[SILab2EveryBranch.xlsx](https://github.com/dariyozz/SI_2024_lab2_222015/files/15287389/SILab2EveryBranch.xlsx)


<h3>Барање 5: Тест случаи според Multiple Condition критериумот за условот
if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)
== '0')</h3>

<table>
  <thead>
    <tr>
      <th>Test Case</th>
      <th>item.getPrice() &gt; 300</th>
      <th>item.getDiscount() &gt; 0</th>
      <th>item.getBarcode().charAt(0) == '0'</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1</td>
      <td>True</td>
      <td>True</td>
      <td>True</td>
    </tr>
    <tr>
      <td>2</td>
      <td>False</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>3</td>
      <td>True</td>
      <td>False</td>
      <td>X</td>
    </tr>
    <tr>
      <td>4</td>
      <td>True</td>
      <td>True</td>
      <td>False</td>
    </tr>
  </tbody>
</table>

  <p>Прв случај сите услови се точни,кај вториот случај што првиот е false бидејќи условот е && одма ислага со false,третиот случај слично но само за вториот услов, и четвртио случај последниот услов е грешен и враќа false </p>
  
<h3>Барање 6: Објаснување на напишаните unit tests</h3>
<p>Во првиот метод за тестирање, го тестираме сценариото кога листата со предмети е null. Очекуваме RuntimeException да се фрли со специфицираната порака. Во вториот метод за тестирање, го тестираме со валидна листа со предмети и плаќање, проверуваме дали методот враќа true како што се очекува.</p>
