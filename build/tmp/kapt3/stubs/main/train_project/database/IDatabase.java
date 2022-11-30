package train_project.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000fJ?\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042*\u0010\u0011\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00130\u0012\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0013H&\u00a2\u0006\u0002\u0010\u0014R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Ltrain_project/database/IDatabase;", "T", "", "data", "", "getData", "()Ljava/util/List;", "add", "", "item", "(Ljava/lang/Object;)Z", "del", "index", "", "replace", "(ILjava/lang/Object;)Z", "search", "predicates", "", "Lkotlin/Function1;", "([Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "untitled1"})
public abstract interface IDatabase<T extends java.lang.Object> {
    
    public abstract boolean add(T item);
    
    public abstract boolean del(int index);
    
    public abstract boolean replace(int index, T item);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<T> search(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, java.lang.Boolean>... predicates);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<T> getData();
}