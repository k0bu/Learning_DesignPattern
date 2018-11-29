# Visitor Pattern
データの各要素に対して処理を行う際に、データ構造と処理を分離してコーディングする。
ConcreteVisitorとConcreteAcceptorの組によって処理実装が決定し、これをdouble dispatchという。
The Open Closed Principle (OCP)：extension open but modification closed

### Visitor Patternの要素:
* **Visitor**
データ構造の要素を辿る、Abstract class。
引数の型によって呼び出すメソッドを変える、メソッドのオーバーロード。

* **ConcreteVisitor**
Visitorの実装

* **Acceptor / Element**
Visitorを受け入れるAcceptor、Interface class。

* **ConcreteAcceptor / CibcreteElement**
Acceptorの実装

* **ObjectStructure**
ConcreteVisitorで各要素、Acceptorを使えるようにする。


