# Task1-Sem2
Task 4.
Динамическая кольцевая очередь на основе массива – обобщенная (generics) реализация. Стратегия поведения при нехватке размера внутреннего массива для хранения всех добавленных элементов очереди – см. комментарии к предыдущей задаче.

Предыдущая задача(Task 3).
Динамический стек на основе массива – обобщенная (generics) реализация. При создании стека размер внутреннего массива равен capacity – передается в конструктор, если используется конструктор без параметром, то значение по умолчанию = 10. Если в процессе работы со стеком добавляется (capacity + 1)-ый элемент, то размер внутреннего массива должен быть увеличен в 2 раза, т.е. capacity становится равным 2 * capacity (предыдущее значение) элементам. Более подробно принципы работы такой схемы только на примере ArrayList описаны в статье https://habr.com/ru/post/128269/.
