// Create some test data and write it to a file.
void test_write_data(void)
{
    FILE *fp;
    int i;
    char *data = "Hello, world!";
    char *filename = "test.c";
    
    fp = fopen(filename, "w");
    if (fp == NULL)
    {
        printf("Error opening file %s\n", filename);
        return;
    }
    
    for (i = 0; i < strlen(data); i++)
    {
        fputc(data[i], fp);
    }
    
    fclose(fp);
}