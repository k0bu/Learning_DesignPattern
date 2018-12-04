# Decorator Pattern
ComponentとDecoratorを同一視している（同じインタフェースを用いている）。
DecoratorはComponentを継承しているため、同じインタフェース、抽象メソッドや実装メソッドを持っている事をインタフェースが透過的であると言う。
再帰ではあるが、深く潜っていくというより、外側に殻・装飾を増やしていく感覚。

### Decorator Patternの要素:

* **Component**
これから機能を追加していくバニラ状態、基礎、核。インタフェースを定める。

* **Concrete Component**
* Componentのインタフェースを実装する。

* **Decorator**
Componentを継承し、同じインタフェースを持つ。また機能などを追加する対象のComponentのインスタンスを保持する。

* **ConcreteDecrator**
Decoratorのインタフェースを実装する。
