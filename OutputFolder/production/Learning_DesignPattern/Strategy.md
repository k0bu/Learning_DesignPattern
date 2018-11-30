# Strategy Pattern

Strategyインタフェースを定義することによって、様々なアルゴリズムの実装をしても。
使用する際に引数としてとるインスタンスが異なるだけなため、全体の見通しが良くなる。
またコード変更部分がConcreteStrategyのみと抑えることができる。

インスタンスを変えるだけでいいので、動的に変更するのは確かに楽そう。
使用するシステムを動的に様々なモノに変える必要がある場合に使える。

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



