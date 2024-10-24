package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    void startWith(){
        diary = new Diary("JohDan", "correctPin");
    }

    @Test public void diaryIsUnlocked_atDefault_test(){
        assertFalse(diary.isLocked());
    }
    @Test public void diaryIsUnlocked_butCanBeLocked(){
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }
    @Test public void diaryIsLocked_butCanBeUnlocked(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPin");
        assertFalse(diary.isLocked());
    }
    @Test public void diaryCanBeUnlocked_withCorrectPin(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPin");
        assertFalse(diary.isLocked());
    }
    @Test public void diaryCannotBeUnlocked_withWrongPin(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("wrongPin");
        assertTrue(diary.isLocked());
    }
    @Test public void diaryCanAddEntry_diaryIsNotEmpty(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPin");
        assertFalse(diary.isLocked());
        diary.add("Title","Body");
        assertEquals(diary.numberOfNotes, 1);
        System.out.println(diary.entries.get(0));
        assertFalse(diary.isEmpty());
    }

    @Test
    public void addEntry_entryAdded(){
        Entry entry = new Entry();
        entry.add("Title","Body");
        assertEquals(entry.getEntryNumber(), 1);
        assertEquals(entry.getTitle(), "Title");
    }
    @Test
    public void addEntryToDiary_CannotAddEntry_diaryIsEmpty(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.add("Title","Body");
        assertFalse(diary.isEmpty());
    }
}
