package list;

public interface Collection {

    /**
     * 移除某个位置的元素
     * @param position
     */
    void remove(int position);

    /**
     * 添加元素，在后面追加
     * @param num
     */
    void add(int num);

    void add(int num , int position);

    /**
     * 获取某个位置元素
     * @param position
     */
    int get(int position);

    int getLength();




}
