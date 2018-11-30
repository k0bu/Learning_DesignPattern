# Composite Pattern
容器と中身を同一視、複数と単数を同一視することで再帰的な構造のモノのコーディングを楽にする。
インタフェースで定義されている抽象メソッドや実装メソッドに基づいて呼び出し側で書けばよくなり、
違いを考えずに済む。

### Composite Patternの要素:
* **Leaf**
中身

* **Composite**
Leafを入れる箱

* **Component**
LeafとCompositeを同一視するための共通のスーパークラス、インタフェース。

* **Client**
Compositeを利用する、


