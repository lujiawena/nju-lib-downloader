package object;

/**
 * 下载某一本书时发生错误。此异常发生在该书对应的文件夹创建之前。因此此书没有任何文件被下载。
 *
 * @author padeoe
 *         Date: 2016/12/12
 */
public class BookDLException extends Exception {
    Book book;

    /**
     * 创意一个初始化的{@code BookDLException}，并指定发生错误的书籍。
     *
     * @param book 发生下载错误的书籍
     */
    public BookDLException(Book book) {
        this.book = book;
    }
}
