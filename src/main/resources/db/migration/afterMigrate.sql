INSERT INTO USERS
    (EMAIL, PASSWORD)
VALUES
    ('test@gmail.com', 'password123'),
    ('hello@gmail.com', 'hello123');

INSERT INTO PICTURES
    (USER_ID, PICTURE_URL, GRAYSCALE, SATURATE, BLUR, SEPIA, HUEROTATE, BRIGHTNESS, CONTRAST, INVERT, OPACITY)
VALUES
    (1, 'https://images.unsplash.com/photo-1525275963076-7a70249a9925?ixlib=rb-0.3.5&s=511578cb05a396ccb1dd82e533c7e66f&auto=format&fit=crop&w=1052&q=80', '.5', '200', '3', '.3', '90', '50', '1', '1', '.5'),
    (2, 'https://images.unsplash.com/photo-1484718125030-175e24540196?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=243776fbfa2ecd89c32161b10dc535f4&auto=format&fit=crop&w=1050&q=80', '1', '100', null, null, null, null, null, null, null);
