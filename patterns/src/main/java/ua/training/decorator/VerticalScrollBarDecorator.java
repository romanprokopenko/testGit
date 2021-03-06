package ua.training.decorator;

/**
 * Created by Roman on 27.11.2016.
 */
class VerticalScrollBarDecorator extends WindowDecorator {
        public VerticalScrollBarDecorator (Window windowToBeDecorated) {
            super(windowToBeDecorated);
        }

        @Override
        public void draw() {
            super.draw();
            drawVerticalScrollBar();
        }

        private void drawVerticalScrollBar() {
            // Draw the vertical scrollbar
        }

        @Override
        public String getDescription() {
            return super.getDescription() + ", including vertical scrollbars";
        }
    }
