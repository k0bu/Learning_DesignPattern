# Strategy Pattern

Strategyインタフェースを定義することによって、様々なアルゴリズムの実装をしても
使用する際引数としてとるインスタンスが異なるだけで、全体の見通しが良くなる。
またコード変更部分がConcreteStrategyで抑えることができる。

### Strategy Patternの要素：
* **Strategy**
利用する戦略・アルゴリズムの形を決める、インタフェースを決める。
アルゴリズムとして使用するであろう抽象メソッドを定義する。


* **ConcreteStrategy**
インタフェースのStrategyを具体的に実装する（implement）。


* **Context**
インタフェースStrategyの時点である抽象メソッドのみを利用する。
使用する際はConcreteStrategyのインスタンスを通して使うため、ConcreteStrategyが増えたり変化したりしても
ContextはStrategyが守られている限り変更する必要がない。



