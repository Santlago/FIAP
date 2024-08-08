import { Button } from "@/components/ui/button";
import {
  Card,
  CardContent,
  CardDescription,
  CardFooter,
  CardHeader,
  CardTitle,
} from "@/components/ui/card";
import { Input } from "@/components/ui/input";
import { Label } from "@/components/ui/label";
import Image from "next/image";

export default function Home() {
  return (
    <main className="flex items-center justify-center h-screen">
      <div>
        <Card className="w-[350px] ">
          <CardHeader>
            <CardTitle>Edit profile</CardTitle>
            <CardDescription>
              Make changes to your profile here. Click save when you're done.
            </CardDescription>
          </CardHeader>
          <CardContent className="grid grid-cols-3 gap-3">
            <div className="flex items-center justify-end">
              <Label htmlFor="name" className="font-bold">Name</Label>
            </div>
            <Input id="name" placeholder="Email" className="col-span-2" />
            <div className="flex items-center justify-end">
              <Label htmlFor="username" className="font-bold">Username</Label>
            </div>
            <Input
              id="username"
              placeholder="@peduarte"
              className="col-span-2"
            />
          </CardContent>
          <CardFooter className="flex justify-end">
            <Button>Save changes</Button>
          </CardFooter>
        </Card>
      </div>
    </main>
  );
}
